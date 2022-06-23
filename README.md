# eventinfo

Kafka Setup :

Download kafka confluent community version by using below link.
https://www.confluent.io/get-started/?product=software

Go to Confluent Software downloaded location in command prompt and execute the commands listed below :
Example Path : C:\Users\<UserName>\softwares\confluent-community-7.1.0\confluent-7.1.0>

Start zookeeper :
bin\windows\zookeeper-server-start.bat etc\kafka\zookeeper.properties

Start Kafka Broker :
bin\windows\kafka-server-start.bat etc\kafka\server.properties

Create a topic with required partitions and replication :
bin\windows\kafka-topics.bat --create --topic firsttopic --partitions 1 --replication-factor 1 --bootstrap-server localhost:9092

Know the topics created already :
bin\windows\kafka-topics.bat --list --bootstrap-server localhost:9092

To know about a specific topic :
bin\windows\kafka-topics.bat --describe --topic firsttopic --bootstrap-server localhost:9092

Push the data via console producer :
bin\windows\kafka-console-producer.bat --topic firsttopic --broker-list localhost:9092 < ..\..\data\sample.csv

Read the messages from beginning via console consumer :
bin\windows\kafka-console-consumer.bat --topic firsttopic --bootstrap-server localhost:9092 --from-beginning

