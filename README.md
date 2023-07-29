# RestCRUDwithJPAorRest
 
This repository includes 2 different projects. In previous repository, I have made Rest-CRUD operations. In this repository, there are 2 ways to make code easier and more basic compared to previous.

--------------------------------------------------------------
First One:
Rest-CRUD operations with JPA. In this repository, we use BookRepository Interface  and make it extend from JPARepository<Book,Integer> , which Book one represents entity name and Integer represents primary key, and this interface do all stuffs that BookDAO and BookDAOImpl. Here is the Code Schema: 

![rest2](https://github.com/muhammedsametakgul/RestCRUDwithJPAorRest/assets/93324656/d111159d-5ace-4dcc-a835-f14c318532af)

We aren't handling with those DAO and DAOImpl. Repository does everything that DAO and DAOImpl do for us.


----------------------------------------------------------------
Second One:
Rest-CRUD operations with Spring Boot Rest. In this repository, we use BookRepository again , and make it extend from JPARepository<Book,Integer> , which Book one represents entity name and Integer represents primary key, and this interface do all stuffs that BookDAO and BookDAOImpl. The main difference with first one is that second one use one more dependency, and this dependency provides us to remove services and rest controller because with that dependency, everything happens with BookRepository and this dependency. Here is the Code Schema

![rest1](https://github.com/muhammedsametakgul/RestCRUDwithJPAorRest/assets/93324656/e23dd690-387d-4823-9952-c5dcfe9a720c)

We don't even need service and rest controller more. With this dependency, our code has been reduced by the nearly %80-90

Here is the dependency :

![dependency](https://github.com/muhammedsametakgul/RestCRUDwithJPAorRest/assets/93324656/a2a2bac5-f7da-413f-ab43-dcd8cf149bbb)

