#language:ru
#encoding:UTF-8

@Parametrized
Функционал: параметризированный запуск теста
  Структура сценария: проверка цены товара "<productsName>"
    Допустим открыта страница "https://www.saucedemo.com/"
    И введен логин "standard_user"
    И введен пароль "secret_sauce"
    И нажата кнопка войти
    И пользователь успешно вошел на "https://www.saucedemo.com/inventory.html"
    Тогда выполнено нажатие на ссылку "<productsName>"


    Примеры:
      | productsName            |
      | Sauce Labs Backpack     |
      | Sauce Labs Bike Light   |
      | Sauce Labs Bolt T-Shirt |