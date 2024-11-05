# catering-spring-boot-starter

## Интеграция в сервис
Для подключения `catering-spring-boot-starter` к сервису необходимо выполнить следующее:

#### 1. Подключить зависимость стартера в `pom.xml` вашего сервиса
```xml
<dependency>
    <groupId>com.github.excome</groupId>
    <artifactId>catering-spring-boot-starter</artifactId>
    <version>0.1.0</version>
</dependency>
```

#### 2. Добавить необходимую конфигурацию стратера в файл `application.yml`

P.S.: Указанные ниже значения являются дефолтными в стартере, если Вам не нужно их менять,
то не заполняйте данные свойсва в конфигурации своего сервиса

```yaml
catering:
  enabled: true # Включение/выключение кейтеринга
  servings-count: 5 # Количество порций
  main-meal: true # Нужно ли главное блюдо
  snack: false # Нужны ли закуски
```

### Пример конфигурации
Пример конфигурации для увеличения количества порций и подачи снеков
с ииспользованием значений по умолчанию в стертере

```yaml
catering:
  servings-count: 25 # Количество порций
  snack: true 
```