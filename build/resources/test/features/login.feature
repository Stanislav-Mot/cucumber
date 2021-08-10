#language:ru
#encoding:UTF-8

@test
Функционал: Проверка входа в кабинет
  Сценарий: Проверка что пользователь входит в кабинет на сайте https://www.saucedemo.com/
    Допустим открыта страница "https://www.saucedemo.com/"
    И введен логин "standard_user"
    И введен пароль "secret_sauce"
    И нажата кнопка войти
    Тогда пользователь успешно вошел на "https://www.saucedemo.com/inventory.html"