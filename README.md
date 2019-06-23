# QTMS

<h1 align="center">Welcome to QTMS 👋</h1>
<p>
  <img src="https://img.shields.io/badge/version-1.0.0-blue.svg?cacheSeconds=2592000" />
  <a href="https://github.com/charlie-world/qtms#readme">
    <img alt="Documentation" src="https://img.shields.io/badge/documentation-yes-brightgreen.svg" target="_blank" />
  </a>
  <a href="https://github.com/charlie-world/qtms/graphs/commit-activity">
    <img alt="Maintenance" src="https://img.shields.io/badge/Maintained%3F-yes-green.svg" target="_blank" />
  </a>
  <a href="https://github.com/charlie-world/qtms/blob/master/LICENSE">
    <img alt="License: MIT" src="https://img.shields.io/badge/License-MIT-yellow.svg" target="_blank" />
  </a>
</p>

> QTMS is test case management service for QA engineers

### 🏠 [Homepage](https://github.com/charlie-world/qtms)

## Prerequisites

- openjdk &gt;=1.8.0
- java 8
- gradle &gt;=5.4.1

## Quick Start

```sh
gradlew build
cp ./build/lib/*.jar app.jar

export MYSQL_URL={INPUT_YOUR_MYSQL_URL} // ex) jdbc:mysql://localhost:3306/my_db
export MYSQL_USERNAME={INPUT_YOUR_MYSQL_USERNAME}
export MYSQL_PASSWORD={INPUT_YOUR_MYSQL_PASSWORD}

java -jar app.jar
```

## Author

👤 **Charlie Lee**

* Github: [@charlie-world](https://github.com/charlie-world)

## 🤝 Contributing

Contributions, issues and feature requests are welcome !<br />Feel free to check [issues page](https://github.com/charlie-world/qtms/issues).

## Show your support

Give a ⭐️ if this project helped you !

## 📝 License

Copyright © 2019 [Charlie Lee](https://github.com/charlie-world).<br />
This project is [MIT](https://github.com/charlie-world/qtms/blob/master/LICENSE) licensed.

***
This README was generated with ❤️ by [readme-md-generator](https://github.com/kefranabg/readme-md-generator)_
