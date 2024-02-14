# SpringFrameworkGBsem9HW_SpringCloud

Домашнее задание

Разработайте микросервисную архитектуру для онлайн-магазина электроники с использованием Spring Cloud. Структура должна включать:

Сервис "Товары": Управление каталогом товаров (добавление, удаление, просмотр).
Сервис "Корзина": Добавление товаров в корзину, удаление товаров из корзины и оформление заказа.
Сервис "Отзывы": Добавление и просмотр отзывов на товары.
API Gateway: Централизованный вход для обработки всех запросов.
Используйте Eureka для обнаружения сервисов

Альтернативно, можно перевести свой текущий проект на микросервисную архитектуру


------------------

* http://localhost:8080 - gateway
* http://localhost:8081 - taskservice
* http://localhost:8082 - executorService
* http://localhost:8083 - entityService 
* http://localhost:8084 - viewService 

--------------------

## RestApi
### Taskservice
* GET      /api/tasks        - all tasks
* POST     /api/tasks        - add task
* GET      /api/tasks/{id}   - get task id
* PUT      /api/tasks/{id}   - update task
* DELETE   /api/tasks/{id}   - delete task


### ExecutorService
* GET      /api/executors        - all executors
* POST     /api/executors        - add executors
* GET      /api/executors/{id}   - get executors id
* PUT      /api/executors/{id}   - update executors
* DELETE   /api/executors/{id}   - delete executors


### ViewService
* http://localhost:8084/index    