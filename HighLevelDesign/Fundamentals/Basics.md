SOA Vs Microservices vs Monolith : https://www.youtube.com/watch?v=XjpxyGEUzBs&t

SOA is Services Autonomy not Runtime Autonomy

Microservices are runtime autonomy as well

https://youtu.be/EpyPFnjue38

- CDN : A content delivery network (CDN) is a geographically distributed group of servers that caches content close to end users/

## Load Balancer

- Proxy : Client Identity is Hidden
- Reverse Proxy vs API Gateway vs Load Balancer : https://www.youtube.com/watch?v=RqfaTIWc3LQ
    - Reverse Proxy : Servers identity is Hidden (acts as Intermediary between different servers) - Eg : Nginx
        - Provides Security, SSL Termination, Load Distribution and Caching. (They can not upscale/downscale)
    -  API Gateway : Single Entry Point for Microservices , widely used in serverless architecture.
        - It handles authentication, authorization and routing requests.
    - Loadbalancer : Distribute Load across servers, downscale and upscale as required.

## Load Balancer Deepdive

### Types of Loadbalancer

- Software (Nginx,HAProxy, etc..) and Hardware (Cisco System Catalyst, etc..) 
    - https://www.enjoyalgorithms.com/blog/load-balancers-in-system-design/

### Categories of Loadbalancer

- L4 Load Balancing 
    - Happens at Transport Layer - It makes routing decisions based on IP address and TCP/UDP port information
    - Eg : F5 BIG-IP
- L7 Load Balancing
    - Layer 7 load balancing operates at the application layer of the OSI model. It makes routing decisions based on the content of the messages, such as HTTP headers, cookies, and URL paths.
    - Eg :  Nginx, AWS Application Load Balancer (ALB)
- HA-Proxy can act as both L4 and L7 Loadbalancer.
- Global Server Load Balancing 
    - Global Server Load Balancing distributes traffic across multiple geographical locations or data centers. It provides disaster recovery and improves performance by directing users to the nearest or most optimal server.
    - Eg : Cloudflare,Akamai

### Load Balancer Algorithms

- Explanation : https://www.youtube.com/watch?v=dBmxNsS3BGE
- https://www.enjoyalgorithms.com/blog/types-of-load-balancing-algorithms/
#### Static
- Round Robin
- Sticky Round Robin
- Weighted Round Robin
- Hash Based
#### Dynamic
- Least Connection
- Least Response Time


