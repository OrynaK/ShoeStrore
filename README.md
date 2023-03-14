# ShoeStrore
Тема: Iнформацiйна система магазину взуття

Постановка задачi: Клiєнт оформлює замовлення на сайтi. Адмiнiстратор приймає або не приймає замовлення в залежностi вiд наявностi товару та передає працiвникам складу. Вони формують замовлення або вiдхиляють його. Якщо замовлення сформовано, воно передається до офісу пакувальника, який пакує замовлення. Адмiнiстратор формує список замовлень що потрiбно доставити, кур’єр обирає замовлення та доставляє його.

Процеси та взаємодiя ролей
 1) Клiєнт та Адмiнiстратор - Клiєнт оформлює замовлення на сайтi. Адмiнiстратор приймає замовлення.
2) Адмiнiстратор та Працiвник складу - Адмiнiстратор передає замовлення працiвнику склада. Працiвник склада складає замовлення i змiнює його статус.
3) Працiвник склада та Пакувальник - Працiвник склада передає взуття пакувальнику. Пакувальник формує замовлення і змінює його статус.
4) Пакувальник та Кур’єр - Пакувальник передає замовлення кур’єру. Кур’єр доставляє замовлення i змiнює його статус.

Ролi та функцii:
1. для незареєстрованих користувачів:
- реєстрацiя на сайтi
- пошук товару за критерiями (назва, тип взуття, розмiр, колiр тощо)
- перегляд iнформацii про обраний товар
- перегляд наявних товарiв
2. для зареєстрованих користувачів:
- авторизацiя на сайтi як користувач
- додавання/видалення товарiв з кошика
- оформлення замовлення
- змiна особистих даних(пароль, e-mail, номер телефону тощо)
- перегляд оформлених замовлень та їх станiв
3. для адмiнiстратора
- авторизацiя на сайтi як адмiнiстратор
- змiна статусу обраного замовлення
- додавання товарiв
- додавання категорiй товарiв
- розподiл товарiв за категорiями
- передача замовлення працiвникам складу
- оформлення замовлення пакувальнику
4. для працiвника складу
- авторизацiя на сайтi як працiвник складу
- змiна статусу обраного замовлення
5. для пакувальника
- авторизацiя на сайтi як пакувальник
- змiна статусу обраного замовлення
6. для кур’єра
- авторизацiя на сайтi як кур’єр
- змiна статусу замовлення

Концепцiя виконання:

Концепція виконання інформаційної системи магазину взуття буде реалізована з використанням Java Spring та MySQL за допомогою наступних кроків:
Розробити базу даних для зберігання інформації про товари, замовлення, клієнтів, адміністраторів, працівників складу, пакувальників та кур'єрів. 
Реалізувати функції для реєстрації, авторизації та зміни особистих даних користувачів (клієнтів, адміністраторів, працівників складу, пакувальників та кур'єрів).
Реалізувати функції для пошуку товару за критеріями та перегляду інформації про товари.
Реалізувати функції для додавання/видалення товарів до/з кошика для зареєстрованих користувачів.
Реалізувати функції для оформлення замовлення та його збереження у базі даних.
Реалізувати функції для зміни статусу замовлення адміністраторами, працівниками складу та пакувальниками.
Реалізувати функції для формування списку замовлень, які потрібно доставити, та вибору замовлення кур'єрами.
Реалізувати функції для доставки замовлень та зміни їх статусу кур'єрами.
Реалізувати функції для додавання товарів, категорій товарів та розподілу товарів за категоріями адміністраторами.

Переваги програми:
простий та зручний iнтерфейс
швидкий пошук потрiбного товару, великий вибiр сортування
прив’язка банкiвськоi картки - полегшує оплату замовлення
можливiсть доставки поштою або кур’єром додому
