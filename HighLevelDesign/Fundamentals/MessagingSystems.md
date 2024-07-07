### Queues

- One to One Communication (Asynchronous)
- Suitable for Parallel Processing
- Messages are removed once consumed

Eg : Stock Broker Application (all requests are in Queue, Stock Broker has 1 Core logic which is replicated across multiple servers, they all process the requests parallely )

- AWS SQS

### Pub Sub (Publish - Subscribe)

- One to Many Communication(Asynchronous)
- Suitable for Sending Messages to wide consumers
- Best for extension (A subscriber can be easily added / removed)
- Messages can be retained for a period such that new consumers can consume them.
- AWS SNS

#### Kafka Combines the best of Both Queues and Sub-Pub paradigms.
