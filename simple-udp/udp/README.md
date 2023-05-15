## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## UDPClient.java

```java 
DatagramSocket clientSocket = new DatagramSocket();
```
UDP 프로토콜에서 클라이언트 호스트는 서버 호스트와의 연결을 필요로 하지 않고 소켓을 생성할 수 있습니다.
따라서, DatagramSocket 인스턴스는 따로 서버의 IP주소나 포트 번호를 인자로 받지 않아도 됩니다.




