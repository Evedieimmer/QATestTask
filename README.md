# QATestTask

## Описание задачи:

### API-автотест для сайта https://petstore.swagger.io/ с автоматическим созданием отчета

#### Структура проекта

При создании использован стек технологий:

1) Kotlin

2) Junit 5.1.0 

3) Gradle

4) Rest Assured 3.0.3

5) Allure 2.9.0

#### Запуск тестов

Последовательность запуска:

1) Открыть IntelliJ IDEA

2) Во вкладке RUN выбрать и запустить конфигурацию: test[generateAllureReport]

3) В папке build найти и открыть файл index.html

4) запустить файл из IntelliJ IDEA с помощью любого браузера

5) просмотреть allure report