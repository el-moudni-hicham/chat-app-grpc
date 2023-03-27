package ma.enset.server;

import io.grpc.ServerBuilder;
import ma.enset.service.chatServiceServer;

import java.io.IOException;

public class Server {
    public static void main(String[] args) throws IOException, InterruptedException {
        int port = 1717;
        io.grpc.Server server= ServerBuilder.forPort(port)
                .addService(new chatServiceServer())
                .build();
        server.start();
        System.out.println("Server Started at port "+ port + " ... ");
        server.awaitTermination();

    }
}
