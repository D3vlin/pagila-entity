# Pagila Entity

## 📌 Overview
**Pagila Entity** is one repository within a distributed, multi-repository architecture based on the Pagila sample database schema for PostgreSQL.  

This module contains the **JPA entity mappings** that represent the persistence layer of the Pagila domain model.  
It provides the object-relational mapping between the PostgreSQL schema and the Java domain representation.

The project as a whole is designed to model a real-world enterprise architecture by separating responsibilities into dedicated modules (DTO, entity, mapper, and service layers), ensuring scalability, maintainability, and clear boundaries between concerns.

---

## 🎯 Purpose
This repository exists to:

- Provide database entity mappings for the Pagila schema
- Encapsulate persistence-related annotations and configuration
- Isolate ORM concerns from service and API layers
- Represent the domain model as stored in PostgreSQL
- Support repository and data-access modules

Entities in this architecture are primarily used when:

- interacting with the database
- defining relationships (OneToMany, ManyToOne, etc.)
- enforcing database constraints at the ORM level
- managing transactions
- persisting and retrieving domain data

---

## 🧱 Project Architecture Context

This repository contains only the **Entity module** of the Pagila ecosystem.

The full architecture is intentionally split across multiple repositories, where each module is independently versioned, published, and maintained.

Related modules live in separate repositories:

| Module | Responsibility | Repository |
|--------|---------------|------------|
| dto | Data transport | https://github.com/D3vlin/pagila-dto |
| entity | Database mapping | https://github.com/D3vlin/pagila-entity |
| mapper | Data access | https://github.com/D3vlin/pagila-mapper |

---

### Architectural Philosophy

Each module is isolated in its own repository to achieve:

- independent versioning  
- loose coupling  
- clear boundaries  
- reusable artifacts  
- microservice readiness  
- simplified dependency graphs  

This repository specifically publishes the **persistence model layer**, which is intended to be consumed by repository or data-access components.

---

## 🗄 Persistence Model Design

The entity layer follows these principles:

- Uses standard JPA annotations
- Reflects the PostgreSQL schema structure
- Maintains relational integrity mappings
- Avoids business logic
- Avoids API-level concerns
- Keeps domain representation aligned with the database model

Entities are not intended to be exposed directly to external clients.  
For external communication, the `pagila-dto` module should be used.

---

## 🚀 Why a Dedicated Entity Module?

Separating entities into their own artifact allows:

- isolation of ORM dependencies
- cleaner separation from DTO contracts
- controlled persistence evolution
- flexible API shaping without schema leakage
- easier migration strategies
- independent versioning from service layers

---

## 📚 Use Cases

This module is intended to be consumed by:

- repository modules
- data-access layers
- migration tooling
- persistence-focused services

It is **not** intended for direct exposure in API contracts.

---

## 🔗 Dependency Usage (Maven)

```xml
<dependency>
    <groupId>co.co.d3vlin</groupId>
    <artifactId>pagila-entity</artifactId>
    <version>1.0.0</version>
</dependency>
