<h3>Применение принципов SOLID в программе калькуляьтор:</h3>

* Принцип единственной ответственности (Single Responsibility Principle) применяется в классе Calculator, 
  который отвечает только за ввод данных;

* Принцип открытости/закрытости (Open/Closed Principle). Controller реализует интерфейсы ServiceArithmetic и ServiceConversion
  в которые мы можем добавить новые методы, что соответствует "открытости для расширения".
  Также нам не требуется менять код Controller напрямую, чтобы добавить новый функционал или изменить существующий.
  Вместо этого, мы должны создавать новые классы или интерфейсы, которые Controller может реализовать или использовать.
  Это соответствует части "закрытости для изменения".

* Принцип подстановки Барбары Лисков (Liskov Substitution Principle) реализуется с помощью интерфейса ServiceConversion,
  который определяет контракт для конвертации чисел (DataConversion), можно реализовать новый конвертор, который будет производить другие вычисления.
  Это можно сделать создав новый класс, который реализует интерфейс ServiceConversion.

* Принцип разделения интерфейса (Interface Segregation Principle). Вместо использования одного интерфейса для
  работы программы, я решил создать более мелкие специфические интерфейсы ServiceArithmetic и ServiceConversion (при желании и их тоже можно разделить),
  так например можно использовать в классе DataConversion не один громоздкий интерфейс, а один мелкий.

* Принцип инверсии зависимостей (Dependency Inversion Principle) применяется в классе Controller,
  в котором реализованы все классы и интерфейсы программы.
