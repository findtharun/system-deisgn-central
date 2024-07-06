Distributed Systems - A colelection of independent computers that appears to its users as one Computer.
 - Computers operate Concurrently
 - Computers Fail Independently
 - They do not operate on Global Clock


### Latency vs Throughput

- Latency determines the delay that a user experiences when they send or receive data from the network.
- Throughput determines the number of users that can access the network at the same time.


### Concurrency vs Parallelism

- Concurrent (Appears like parallel but not , ex : A chef Making a Salad  when  sandwich is in being heated)
    - Single Core Multi Threading
- Parallel (2 Chefs , 1 Making Sandwich , 1 Making Salad)
    - Multi Core Processing

### API vs Web Service

- APIs are application interfaces, meaning that one application is able to interact with another application in a standardized way. (Need not to be over a network)
- Web services are a type of API, which must be accessed through a network connection.
- REST APIs are a standardized architecture for building web APIs using HTTP methods.

```
All Web Services are APIs, but not all APIs are Web services.
APIs Can use various protocols (HTTP, HTTPS, TCP/IP,RPC etc.)
Web Service: Traditionally uses XML for SOAP and JSON/XML for REST.
```

https://rapidapi.com/blog/api-vs-web-service/