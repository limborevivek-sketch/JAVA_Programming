# Java Socket Programming

This folder contains basic **Java Socket Programming** programs for understanding communication between a **client and a server**.

The programs use Java's `java.net` and `java.io` packages to establish a connection and exchange messages through the command line.

## Programs

| Program | Description |
|---|---|
| `ChatServer.java` | Creates a server using `ServerSocket`, waits for a client connection, receives messages, and sends replies. |
| `ChatClient.java` | Connects to the server using `Socket`, sends messages, and receives replies from the server. |

## Concepts Learned

- Client-Server Architecture
- Socket Programming
- `Socket`
- `ServerSocket`
- `PrintStream`
- `BufferedReader`
- `InputStreamReader`
- Input and Output Streams
- Port Numbers
- Sending and Receiving Messages
- Basic CUI (Character User Interface)

## Packages Used

```java
import java.io.*;
import java.net.*;
```

### `java.net`

Used for network communication, including:

- `Socket`
- `ServerSocket`

### `java.io`

Used for reading and writing data, including:

- `BufferedReader`
- `InputStreamReader`
- `PrintStream`

## How It Works

```text
        Client
          │
          │ Socket Connection
          ▼
        Server
          │
          │
    Message Exchange
          │
          ▼
   Client ↔ Server
```

The server starts first and listens on **port 5100**. The client then connects to the server using `localhost` and port `5100`.

## Current Progress

This folder currently contains a basic **command-line chat application** demonstrating two-way communication between a Java client and server.

More socket-programming programs will be added as new concepts are learned.
