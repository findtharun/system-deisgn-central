Explanation : [Tech Prep YT Channel](https://www.youtube.com/watch?v=5DTxuMDYvNc)

Web Cralwer is used for Indexing, Data Mining, Web Archivals.

## Scope and Requirements

### Functional

- Given Seed URL, Crawl all related Pages
- Duplicate Pages are not allowed.
- What type of Content - HTML for now but need to be extensible for new content (Extensibility)
- Prioritize URLs

### NFR

- Highly Scalable
- Politeness (We should not web Page continuously) - Security
- Robustness & Reliable (Web is full of Malicious links, unresponsive servers, bad HTML responses etc..) and Our system should be able to handle it.

## Estimation

- 1Billion (10^9) writes every Month
- Average write size - 2.5MB == 2,621,440 bytes
- Storage requirement for 5 year : 1.5 * 10^17 TB (30 Peta Bytes)

