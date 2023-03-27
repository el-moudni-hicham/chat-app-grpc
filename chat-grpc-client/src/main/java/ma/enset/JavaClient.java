package ma.enset;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import ma.enset.stubs.Chat;
import ma.enset.stubs.chatServiceGrpc;

import java.io.IOException;
import java.util.Scanner;

public class JavaClient {
    static chatServiceGrpc.chatServiceStub stub;
    static String username;

    public static void login(){
        ManagedChannel managedChannel= ManagedChannelBuilder.forAddress("localhost",1717)
                .usePlaintext()
                .build();
        stub = chatServiceGrpc.newStub(managedChannel);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username : ");
        username =sc.nextLine();
        Chat.connect requestLogin= Chat.connect.newBuilder()
                .setUserName(username)
                .build();
        stub.login(requestLogin, new StreamObserver<Chat.messageResponse>() {

            @Override
            public void onNext(Chat.messageResponse messageResponse) {
                //System.out.println();
                System.out.println(messageResponse);
                //System.out.println();
            }
            @Override
            public void onError(Throwable throwable) {
            }
            @Override
            public void onCompleted() {
            }
        });
    }

    public static void send(){
        Scanner sc = new Scanner(System.in);
        while (true){
            String content=sc.nextLine();
            String[] message =content.split(" > ");
            Chat.messageRequest request= Chat.messageRequest.newBuilder()
                    .setFrom(username)
                    .setTo(message[0])
                    .setMessage(message[1])
                    .build();
            stub.sendTo(request, new StreamObserver<Chat.messageResponse>() {
                    @Override
                    public void onNext(Chat.messageResponse messageResponse) {
                    }
                    @Override
                    public void onError(Throwable throwable) {
                    }
                    @Override
                    public void onCompleted() {
                    }
            });
        }
    }


    public static void main(String[] args) throws IOException, InterruptedException {
        login();
        Thread.sleep(2500);
        send();
        System.in.read();
    }
}