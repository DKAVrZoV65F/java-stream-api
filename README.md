# Java Stream API Demo 🔄💡

**Java Stream API Demo** — демонстрационный проект, разработанный с использованием Java 21 и Spring Boot 3.x, который иллюстрирует возможности **Stream API** для обработки коллекций данных. В данном проекте показаны базовые операции:

- **Промежуточные операции:** фильтрация, преобразование, сортировка и т.д.
- **Терминальные операции:** сбор данных, агрегация, подсчёт и многое другое.

Проект подходит для изучения принципов функционального программирования в Java и демонстрации его практического применения в современных приложениях, включая веб-сервисы на базе Spring Boot.

## ⚙️ Технологии

- **Java 21** ☕ – современная версия языка программирования.
- **Spring Boot 3.x** 🌱 – фреймворк для разработки веб-приложений и микросервисов.
- **Maven** 🔨 – система управления зависимостями и сборки проекта.
- **Stream API** 🔄 – инструмент для функциональной обработки коллекций данных.

## ⬇️ Установка

1. **Клонируйте репозиторий:**

   ```bash
   git clone https://github.com/DKAVrZoV65F/java-stream-api.git
   cd java-stream-api
   ```

2. **Установите:**
   - [Java 21](https://www.oracle.com/java/technologies/javase/jdk21-downloads.html)
   - [Maven](https://maven.apache.org/install.html)

3. **Проверьте настройки проекта:**  
   Убедитесь, что переменные окружения для Java и Maven настроены корректно.

## ▶️ Запуск проекта

Соберите и запустите приложение с помощью Maven:

```bash
mvn clean install
mvn spring-boot:run
```

После запуска, если проект содержит веб-слой, приложение будет доступно по адресу [http://localhost:8080](http://localhost:8080).  
Если это консольное приложение, выполните команду запуска JAR-архива:

```bash
java -jar target/java-stream-api.jar
```

## 🔍 Примеры использования

Проект демонстрирует работу с Java Stream API. Ниже приведены примеры кода, иллюстрирующие базовые операции:

- **Фильтрация данных:**

  ```java
  List<String> names = List.of("Анна", "Алексей", "Борис", "Дмитрий");
  List<String> filteredNames = names.stream()
                                   .filter(name -> name.startsWith("А"))
                                   .collect(Collectors.toList());
  ```

- **Преобразование элементов:**

  ```java
  List<Integer> numbers = List.of(1, 2, 3, 4, 5);
  List<Integer> squares = numbers.stream()
                                 .map(n -> n * n)
                                 .collect(Collectors.toList());
  ```

- **Вычисление агрегированных значений:**

  ```java
  double average = numbers.stream()
                          .mapToInt(Integer::intValue)
                          .average()
                          .orElse(0);
  ```
