# Sorting-App-BackEnd

The application is used to get Random number and Sort them in ascending order inculding number of positions changed by using another Spring Boot Rest Service and embedded database(H2).. 

This application will also show the previous history of Numbers sorted.

##Prerequisites:

IDE required to start the Spring Boot Application.

##REST Services 

#Random Number Service:
        This service is to provide Random number.
        Service URL: http://localhost:8090/sorting-app/randomnumbers

#Sort Number Service:
        This service is to sort number in ascending order and save it in embedded database(H2).
       Service URL:  http://localhost:8090/sorting-app/sort

#History Service:
        This service is to retreive history of sorted numbers 
        Service URL: http://localhost:8090/sorting-app/history



