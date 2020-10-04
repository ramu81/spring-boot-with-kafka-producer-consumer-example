# spring-boot-with-kafka-producer-consumer-example

This Project covers how to use Spring Boot with Spring Kafka to Produce/Consume String message from Kafka topics

Start Zookeeper
bin/zookeeper-server-start.bat config/zookeeper.properties


Start Kafka Server
bin/kafka-server-start.bat config/server.properties

Create Kafka Topic

bin/kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic Kafka_Example

