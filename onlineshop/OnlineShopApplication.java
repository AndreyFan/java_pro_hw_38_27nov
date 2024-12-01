package de.telran.onlineshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnlineShopApplication {
//1 уровень сложности: В проект работи в классе добавлен файл DB.png, в котором описана примерная структура БД online магазина.
//Создайте Entity  для каждой вида таблицы и опишите в них все связи между таблицами, которые показаны ны схеме:
//1) Users - пользователи
//2) Products - товары
//3) Cart - корзина
//4) CartItems - товары в корзине
//5) Orders - заказы
//6) OrderItems - товары в заказе
//7) Favorites - избранные товары
//8) Categories - категории товаров.
//Запустите проект и проверьте в БД корректность созданных связей и внешних ключей.

	public static void main(String[] args) {
		SpringApplication.run(OnlineShopApplication.class, args);
	}

}
