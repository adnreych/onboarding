## PSB-onboarding - прототип команды 1DevFull участника финала Цифрового прорыва 2021 -- backend

Ссылка на front-end часть - https://github.com/kirillnepomiluev/psbonboardingIT

### Инструкция по установке
На машине, где будет происходить развертывание должен стоять Docker

После запуска и выполнения Dockerfile из корневой папки проекта сервер доступен на порте `8085` и принимает GET-запросы:

Получение страниц в Confluence
```
GET /api/pages HTTP/1.1
```

Получение пользовательских задач в Jira, где `{userId}` - идентификатор пользователя
```
GET /api/tasks/{userId} HTTP/1.1
```