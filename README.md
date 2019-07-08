# MCBEClient

This software can connect to BDS, pmmp with offlinemode.

## How to use
<!--
* git clone https://github.com/hmy2001/JRakNet.git
* cd JRakNet
* mvn install
* cd ~/
-->

```bash
user@localhost:~/work$ git clone https://github.com/hmy2001/MCBEClient.git
user@localhost:~/work$ cd MCBEClient
```

Just type the command follows.

```bash
user@localhost:~/work/MCBEClient$ gradle shell
```

Or type following command to generate jar release archive

```sh
user@localhost:~/work/MCBEClient$ gradle release
user@localhost:~/work/MCBEClient$ java -jar build/libs/MCBEClient-1.0-SNAPSHOT.jar
```

## Features implemented
* Login with offline mode
* The client can connect to all server with offline mode

## Features not yet implemented
* Analyze all packet
* Login with Xbox Live

## TODO
* Refactoring
