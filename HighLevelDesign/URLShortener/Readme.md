

Clear Explanation : https://www.youtube.com/watch?v=16d35un5a9Q

- Generate Unique ID
- Perform Base 62 Encoding and Store
(DB Schema - ID, Long Url, Short Url)

Decode
- Decode Unique Id by applying base62 Decoding on ShortUrl
- Return Long Url

### Security Considerations

- Validate URLs before Sending (To Prevent from SQL Injection, other attacks)
- Rate Limiter can be Implemented
- Enhanced Monitoring and logging