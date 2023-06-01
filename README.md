![Thumbnail](https://github.com/ProtonCrypto/ProtonApiLV2/assets/52669201/1ce5d631-c653-4f9a-9dae-49fc295619b2)

### 🦊 Информация
API LV 2 - это второй слой защиты вашей сид фразы. После поступления комбинаций слов на сервер, слова разделяются на 12 частей и к каждой части присваиваться свой уникальный номер. Теперь ваша сид фраза храниться не на одном, не на двух, а на 12 серверах в раздробленном состоянии и что бы злоумышленник смог получить доступ к вашему кошельку ему придётся взломать каждый сервер. Это делает кражу ваших средств невозможным.

### 📎 Активные проекты

* [⚙ Android кошелек](https://github.com/ProtonCrypto/ProtonWalletRecoveryBot)
* [⚙ Главный API LV 1](https://github.com/ProtonCrypto/ProtonApiLV1)
* [⚙ Модуль API LV 2](https://github.com/ProtonCrypto/ProtonApiLV2)
* [⚙ Бот для востановления](https://github.com/ProtonCrypto/ProtonWalletRecoveryBot)

### 📜 Характеристики

* Язык: Java
* Фреймворк: Spring
* База Даных: PostgreSQL

### ⚙ Запуск сервера

* Измените переменные в src/main/resources/application.properties 
* Последовательно выполните даные команды

```
$ mvn install
$ mvn spring-boot:run
```

