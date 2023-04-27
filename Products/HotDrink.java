package Products;

public class HotDrink extends Product{
    private int temperature;

    public HotDrink(String name, Double price, int temperature) {
        super(name, price);
        this.temperature = temperature;
    }

    /**
     * Функция возвращает информацию об объекте
     * @return Вся информация об объекте String
     */
    @Override
    public String toString() {
            return  "Product{" +
                    "name='" + getName() + '\'' +
                    ", cost=" + getPrice() +
                    ", temp=" + temperature +
                    '}';
    }

    /**
     * Устанавливает значение температуры
     * @param temperature Новое значение температуры напитка
     */
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}


