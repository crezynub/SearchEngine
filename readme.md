    Итоговый проект курса "Java-разработчик" от Skillbox.

Задача: Разработать поисковый движок по сайту — приложение (backend часть), которое позволяет 
индексировать страницы и осуществлять по ним быстрый поиск. Движок разрабатывается на фреймворке Spring.
Поисковый движок представляет из себя Spring-приложение (JAR-файл, запускаемый на любом сервере или компьютере), 
работающее с локально установленной базой данных MySQL, имеющее простой веб-интерфейс и API, через который 
им можно управлять и получать результаты поисковой выдачи по запросу.
    
Описание веб-интерфейса.

    Веб-интерфейс (frontend-составляющая) проекта представляет собой
    одну веб-страницу с тремя вкладками:
        ● Dashboard. Эта вкладка открывается по умолчанию. На ней
    отображается общая статистика по всем сайтам, а также детальная
    статистика и статус по каждому из сайтов (статистика, получаемая по
    запросу /api/statistics).
        ● Management. На этой вкладке находятся инструменты управления
    поисковым движком — запуск и остановка полной индексации
    (переиндексации), а также возможность добавить (обновить) отдельную
    страницу по ссылке:
        ● Search. Эта страница предназначена для тестирования поискового
    движка. На ней находится поле поиска, выпадающий список с выбором
    сайта для поиска, а при нажатии на кнопку «Найти» выводятся
    результаты поиска (по API-запросу /api/search):
    Вся информация на вкладки подгружается путём запросов к API вашего
    приложения. При нажатии кнопок также отправляются запросы


Принципы работы поискового движка:

       1. В конфигурационном файле application.yaml перед запуском приложения задаются
            адреса сайтов, по которым движок должен осуществлять поиск.
       2. Поисковый движок должен самостоятельно обходить все страницы
          заданных сайтов и индексировать их (создавать так называемый индекс)
          так, чтобы потом находить наиболее релевантные страницы по любому
          поисковому запросу.
       3. Пользователь присылает запрос через API движка. Запрос — это набор
          слов, по которым нужно найти страницы сайта.
       4. Запрос определённым образом трансформируется в список слов,
          переведённых в базовую форму. Например, для существительных —
          именительный падеж, единственное число.
       5. В индексе ищутся страницы, на которых встречаются все эти слова.
       6. Результаты поиска ранжируются, сортируются и отдаются пользователю.

Локальный запуск проекта:

    1. Установите СУБД MySQL и создайте БД search_engine

    2. В файле конфигурации application.yml укажите
        url и название сайтов в параметре indexing-settings
        пользователя и пароль для БД

    3. Для доступа к библиотекам лемматизатора необходимо указать токен:
    Найдите или создайте файл settings.xml
        В Windows он располагается в директории C:/Users/<Имя вашего пользователя>/.m2
        В Linux — в директории /home/<Имя вашего пользователя>/.m2
        В macOs — по адресу /Users/<Имя вашего пользователя>/.m2

        Если файла settings.xml нет, создайте и вставьте в него:
        
        settings.xml

            <settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
            xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
            xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0
            https://maven.apache.org/xsd/settings-1.0.0.xsd">
                <servers>
                    <server>
                        <id>skillbox-gitlab</id>
                         <configuration>
                            <httpHeaders>
                                <property>
                                    <name>Private-Token</name>
                                    <value>glpat-Viu1C6oUSddYB3JdKviW</value>
                                </property>
                            </httpHeaders>
                        </configuration>
                    </server>
                </servers>
            </settings>
        
        Если файл уже есть, то добавьте только блок server в servers
    4. Веб-интерфейс запущенного приложения будет доступен на http://localhost:8080/


Стек используемых технологий:

    Java 17
    Maven
    Spring Boot
    MySQL 8
    Hibernate
    Lombok
