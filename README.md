# Task06
Task06_num4

Задача 6.
Словари (основанные на деревьях или хеш-таблицах)

Целью данной задачи является знакомство со стандартными для любого современного языка программирования структурами данных – словарями (другое название – ассоциативные массивы), которые в библиотеке языка Java называются Map (стандартные реализации – TreeMap, HashMap, LinkedHashMap и др.).
Но для того, чтобы не только уметь с этими структурами работать, но и знать, как они внутри устроены (чтобы хорошо понимать возможности и ограничения этих структур), данную задачу вам необходимо будет выполнить как со стандартными классами из библиотеки Java (TreeMap<T>, HashMap<T>, LinkedHashMap<T>), так и со своей собственной реализацией данных структур. Не пугайтесь, в примерах к лекциям по деревьям поиска и хеш-таблицам эти структуры уже реализованы, и вам можно ими воспользоваться, но естественно, при желании вы можете выполнить полностью свою собственную реализацию указанных структур данных.
Собственные реализации структур должны соответствовать стандартному интерфейсу Map<K, V> и именно этот тип данных необходимо использовать в решении, но чтобы можно было как-то указать, какой конкретно тип данных необходимо использовать – стандартные классы или собственную реализацию (примерно также, как со списками – объявляем тип List<T>, а создаем экземпляры, как правило, ArrayList<T>). В вашем решении можно передавать конкретный экземпляр Map<T> в качестве параметра методу, который непосредственно реализует алгоритм задачи.
После решения задачи вы должны четко понимать, как рассматриваемые алгоритмы и структуры данных (деревья, хеш-таблицы) связаны со словарями (Map<T>) в языке Java.
В большинстве случаев (на усмотрение преподавателя) задачи предполагают ввод данных из файла и оконный интерфейс. В 2021 году допускается консольная реализация.
Если в условии задачи что-то непонятно – попросить пояснить преподавателя.

  
  4.	Найти все позиции в массиве/списке целых чисел наибольшего из наиболее часто встречающихся значений. Алгоритм должен работать за время O(n*log(n)). Использовать структуру данных Map<Integer, List<Integer>> (ключ – число из массива, значение – позиции этого числа). Далее пройти по данному словарю для поиска нужного числа и его позиций.
