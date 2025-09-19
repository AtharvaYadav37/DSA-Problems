class Spreadsheet {

    HashMap<String, Integer> map = new HashMap<>();

    public Spreadsheet(int rows) {
        
    }
    
    public void setCell(String cell, int value) {
        map.put(cell, value);
    }
    
    public void resetCell(String cell) {
        if(map.containsKey(cell))  map.remove(cell);
    }
    
    public int getValue(String formula) {
        int i = 1;                                                  //At 0 index = '='
        int total = 0;

        char c = formula.charAt(i);
        i = formula.indexOf('+');                                   //divides the string into first value and second value
        if(c >= 'A' && c <= 'Z'){                                   //check if value is key or number
            total += map.getOrDefault(formula.substring(1, i), 0);
        }
        else{
            total += Integer.parseInt(formula.substring(1, i));
        }

        c = formula.charAt(++i);
        if(c >= 'A' && c <= 'Z'){                                   //check if value is number or key
            total += map.getOrDefault(formula.substring(i, formula.length()), 0);
        }
        else{
            total += Integer.parseInt(formula.substring(i, formula.length()));
        }

        return total;
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */