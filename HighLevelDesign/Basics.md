SOA Vs Microservices vs Monolith : https://www.youtube.com/watch?v=XjpxyGEUzBs&t

SOA is Services Autonomy not Runtime Autonomy

Microservices are runtime autonomy as well

https://youtu.be/EpyPFnjue38


### LoadBalncer

- Types of Load Balancers : https://www.youtube.com/watch?v=dBmxNsS3BGE
- Proxy : Client Identity is Hidden
- Reverse Proxy vs API Gateway vs Load Balancer : https://www.youtube.com/watch?v=RqfaTIWc3LQ
    - Reverse Proxy : Servers identity is Hidden (acts as Intermediary between different servers) - Eg : Nginx
        - Provides Security, SSL Termination, Load Distribution and Caching.
    -  API Gateway : Single Entry Point for Microservices , widely used in serverless architecture.
        - It handles authentication, authorization and routing requests.
    - Loadbalancer : Distribute Load across servers, downscale and upscale as required.