from setuptools import setup, find_packages

setup(
    name='ma_enset_chat',
    version='0.1.0',
    packages=find_packages(),
    install_requires=[
        'grpcio',
        'grpcio-tools',
    ],
)