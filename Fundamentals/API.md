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
Rest API Design Fundamentals : https://www.restapitutorial.com/


## Request - Response Paradigm

- REST - Focus on Resource and CRUD Operations (GET User, Create User Etc..)
- RPC (Remote Procedure Call) - Focus on Function / Actions (Archive, Deactivate, Search, etc..)
- GraphQL (Goo
d when need data filtering on client side.(Flexibility))

## Event Driven Paradigm

Solves Problems associated with Polling

- Web Hooks (Good for updating clients on certain events and avoiding pulling style endpoints)
- Web Sockets (Good for low latency two-way communications)
- HTTP Streaming (Good for long-term connections over HTTP)