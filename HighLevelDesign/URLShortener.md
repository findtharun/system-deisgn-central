Clear Explanation : https://www.youtube.com/watch?v=16d35un5a9Q

### Scope and Requirements

- Shortened Url (should be as short as possible)
- Contains Alpha Numeric characters(62)

Estimation

- 100 Million URLs generated per day
- Average Length is 100 Chars
- For 10 Years - 36.5 TB

(Fast reads and Writes) 

### API Design

- POST URL Shortening : return short URL (201 Created, 400 Bad Request, 409 Conflict - Already Exists)
- Short URL to Long Url redirecting (GET) : If we need analytics then 302
    - 301 (Permanently Mooved) Browser Caches
    - 302  (Temporarily Moved) -  subsequent requests for the same URL will still be sent to the URL shortening service
    - 404 Not Found

### DB Design
-  (We can use Completely NoSQL and Wite Algorithm for Checking if ID exists or not and getting ID)
-  We can use SQL fo Ids and checking them, Complete records in NoSQl
    
DB Schema - ID (PK)
NoSQL
ID, Long Url, Short Url, Creation TimeStamp

### HLD

Sever, LoadBalance , Cache , DB 

### HLD Deepdive

1. With Hashing Workflow
2. With Base 62 Workflow

#### Algorithm

Encode
- Generate Unique ID
- Perform Base 62 Encoding and Store

Decode

- Decode Unique Id by applying base62 Decoding on ShortUrl
- Return Long Url

### Security Considerations

- Validate URLs before Sending (To Prevent from SQL Injection, other attacks)
- Rate Limiter can be Implemented
- Enhanced Monitoring and logging
