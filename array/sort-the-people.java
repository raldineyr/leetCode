TreeMapclass Solution {
    public String[] sortPeople(String[] names, int[] heights) {
     List<String> peopleList = new ArrayList<>();
        Map<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            peopleList.add(entry.getValue());
        }
        String[] result = new String[names.length];
        for (int i = 0; i < peopleList.size(); i++) {
            result[i] = peopleList.get(i);
        }
        return result;
    }
}
