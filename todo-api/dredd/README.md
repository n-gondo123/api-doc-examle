### dreddの実行方法(詳細はpackage.jsonを参照)

1. dreddのインストール
```
$ npm install
```

2. サンプルアプリケーションを実行しておく(sbtが必要)
```
$ cd ../swagger-play2.4
$ sbt run
```

3. テストを実行
- API blueprint
  ```
  $ npm test
  ```

- Swagger
  ```
  $ npm run test:swagger
  ```
