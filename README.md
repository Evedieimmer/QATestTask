# QATestTask

## Описание задачи 2.1:

### API-автотест для сайта https://petstore.swagger.io/ с автоматическим созданием отчета

#### Структура проекта

##### Aвтотесты для блоков:

GET - получить питомца по ID;

POST - добавить нового питомца;

DELETE - удалить питомца по ID.

##### При создании использован стек технологий:

1) Kotlin;

2) Junit 5.1.0;

3) Gradle;

4) Rest Assured 3.0.3;

5) Allure 2.9.0.

#### Запуск тестов

предварительно:

скачать папку test c github

##### Последовательность запуска:

1) Открыть IntelliJ IDEA;

2) Во вкладке RUN выбрать и запустить конфигурацию: test[generateAllureReport];

3) В папке build найти и открыть файл index.html;

4) запустить файл из IntelliJ IDEA с помощью любого браузера;

5) просмотреть allure report.

## Описание задачи 2.2:


### UI-автотест для сайта https://testsheepnz.github.io/BasicCalculator.html 

#### Структура проекта

предварительно:

скачать папку UI c github


##### При создании использован стек технологий:

1) Kotlin

2) Junit 5.5.2

3) Gradle

4) Selenium 3.14.0

5) паттерн PageObject


#### Запуск теста Substract

Последовательность запуска:

1) Открыть IntelliJ IDEA;

2) Во вкладке RUN выбрать и запустить конфигурацию: TestSub;

3) при запуске откроется сайт "basic calculator" и произойдет проверка на вычитание;

4) успешный тест покажет, что ответ соответствует заданному.

#### Запуск теста Concatenate

Последовательность запуска:

1) Открыть IntelliJ IDEA;

2) Во вкладке RUN выбрать и запустить конфигурацию: TestCon;

3) при запуске откроется сайт "basic calculator" и произойдет проверка на объединение;

4) успешный тест покажет, что ответ соответствует заданному.

_______________________________________________________________________________________________________________________________

### UI-автотест для сайта https://testsheepnz.github.io/random-number.html

#### Структура проекта


##### При создании использован стек технологий:

1) Kotlin

2) Junit 5.5.2

3) Gradle

4) Selenium 3.14.0

5) паттерн PageObject


#### Запуск теста

Последовательность запуска:

1) Открыть IntelliJ IDEA;

2) Во вкладке RUN выбрать и запустить конфигурацию: TestNumGame;

3) при запуске откроется сайт "The number game" и произойдет проверка на ввод строки;

4) успешный тест покажет, что условие, вывод лейбла с ошибкой, выполнено.
