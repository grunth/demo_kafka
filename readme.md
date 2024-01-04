kafka-topics --create --bootstrap-server localhost:29092 --replication-factor 1 --partitions 1 --topic mytopic
kafka-topics --describe --bootstrap-server localhost:29092

kafka-topics --describe --topic quickstart-events --bootstrap-server localhost:29092

kafka-console-producer --topic quickstart-events --bootstrap-server localhost:29092

kafka-console-consumer --topic alibaba --from-beginning --bootstrap-server localhost:29092