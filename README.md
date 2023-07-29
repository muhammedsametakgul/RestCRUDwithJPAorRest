# RestCRUDwithJPAorRest
 
This repository includes 2 different projects. In previous repository, I have made Rest-CRUD operations. In this repository, there are 2 ways to make code easier and more basic compared to previous.

--------------------------------------------------------------
First One:
Rest-CRUD operations with JPA. In this repository, we use BookRepository Interface  and make it extend from JPARepository<Book,Integer> , which Book one represents entity name and Integer represents primary key, and this interface do all stuffs that BookDAO and BookDAOImpl. Here is the Code Schema: 

![rest2](https://github.com/muhammedsametakgul/RestCRUDwithJPAorRest/assets/93324656/356ca1c5-abbf-46ba-93c4-59e5d3268a3d)

We aren't handling with those DAO and DAOImpl. Repository does everything that DAO and DAOImpl do for us.


----------------------------------------------------------------
Second One:
Rest-CRUD operations with Spring Boot Rest. In this repository, we use BookRepository again , and make it extend from JPARepository<Book,Integer> , which Book one represents entity name and Integer represents primary key, and this interface do all stuffs that BookDAO and BookDAOImpl. The main difference with first one is that second one use one more dependency, and this dependency provides us to remove services and rest controller because with that dependency, everything happens with BookRepository and this dependency. Here is the Code Schema

![rest1](https://github.com/muhammedsametakgul/RestCRUDwithJPAorRest/assets/93324656/c8a0601f-f774-43a5-a8c4-9eb6d3b9f48f)

We don't even need service and rest controller more. With this dependency, our code has been reduced by the nearly %80-90

Here is the dependency :

![dependency](https://github.com/muhammedsametakgul/RestCRUDwithJPAorRest/assets/93324656/201fc73e-f80c-40cd-b5c7-58275b0b3fa4)

