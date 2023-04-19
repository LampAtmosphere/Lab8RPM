
    import java.util.regex.Matcher;
    import java.util.regex.Pattern;
    
    public class Lab12 {
        public static void main(String[] args) {
            String text = "Some text with an IP address 192.168.0.1 and another one 10.0.0.1"; // Заданный текст для поиска IP-адреса
    
            // Шаблон регулярного выражения для поиска IP-адреса
            String patternString = "(\\d{1,3}\\.){3}\\d{1,3}";
    
            // Создание объекта Pattern
            Pattern pattern = Pattern.compile(patternString);
    
            // Поиск совпадений в тексте
            Matcher matcher = pattern.matcher(text);
    
            // Вывод всех найденных IP-адресов
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
    }
    
