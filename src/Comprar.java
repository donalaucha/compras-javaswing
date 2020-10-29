 class Comprar {
     String nombre1,nombre2;
     int valor1,valor2,descuento1,descuento2,total1,total2,subtotal,descuento_general,descuento_general2,t1,t2;

    public Comprar() {
    }

    public Comprar(String nombre1, String nombre2, int valor1, int valor2, int descuento1, int descuento2, int total1, int total2, int subtotal, int descuento_general, int descuento_general2, int t1, int t2) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.descuento1 = descuento1;
        this.descuento2 = descuento2;
        this.total1 = total1;
        this.total2 = total2;
        this.subtotal = subtotal;
        this.descuento_general = descuento_general;
        this.descuento_general2 = descuento_general2;
        this.t1 = t1;
        this.t2 = t2;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public int getDescuento1() {
        return descuento1;
    }

    public void setDescuento1(int descuento1) {
        this.descuento1 = descuento1;
    }

    public int getDescuento2() {
        return descuento2;
    }

    public void setDescuento2(int descuento2) {
        this.descuento2 = descuento2;
    }

    public int getTotal1() {
        return total1;
    }

    public void setTotal1(int total1) {
        this.total1 = total1;
    }

    public int getTotal2() {
        return total2;
    }

    public void setTotal2(int total2) {
        this.total2 = total2;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    public int getDescuento_general() {
        return descuento_general;
    }

    public void setDescuento_general(int descuento_general) {
        this.descuento_general = descuento_general;
    }

    public int getDescuento_general2() {
        return descuento_general2;
    }

    public void setDescuento_general2(int descuento_general2) {
        this.descuento_general2 = descuento_general2;
    }

    public int getT1() {
        return t1;
    }

    public void setT1(int t1) {
        this.t1 = t1;
    }

    public int getT2() {
        return t2;
    }

    public void setT2(int t2) {
        this.t2 = t2;
    }

    
     
     
    public int compra_uno(int valor1,int descuento1, int total1){
        descuento1=(valor1*5)/100;
        total1=valor1-descuento1;
        return total1;
    };
    
    public int compra_dos(int valor2,int descuento2, int total2){
        descuento2=(valor2*8)/100;
        total2=valor2-descuento2;
        return total2;
    };
    
    public int csubtotal(int valor1,int descuento1, int total1,int valor2,int descuento2, int total2,
            int subtotal){
     descuento1=(valor1*5)/100;
        total1=valor1-descuento1;
        
         descuento2=(valor2*8)/100;
        total2=valor2-descuento2;
    subtotal=total1+total2;
    return subtotal;
    
    }
    
    public int descuento1(int valor1,int descuento1, int total1,int valor2,int descuento2, int total2,
            int subtotal, int descuento_general){
    
    descuento1=(valor1*5)/100;
    total1=valor1-descuento1;
        
    descuento2=(valor2*8)/100;
    total2=valor2-descuento2;
    subtotal=total1+total2;
    
    descuento_general=(subtotal*12)/100;
    
    return descuento_general;
   
    };
    
    public int descuento2(int valor1,int descuento1, int total1,int valor2,int descuento2, int total2,
            int subtotal, int descuento_general2){
    
    descuento1=(valor1*5)/100;
    total1=valor1-descuento1;
        
    descuento2=(valor2*8)/100;
    total2=valor2-descuento2;
    subtotal=total1+total2;
    
    descuento_general2=(subtotal*7)/100;
    
    return descuento_general2;
   
    };
    
    public int total1(int valor1,int descuento1, int total1,int valor2,int descuento2, int total2,
            int subtotal, int descuento_general, int t1){
    
    descuento1=(valor1*5)/100;
    total1=valor1-descuento1;
        
    descuento2=(valor2*8)/100;
    total2=valor2-descuento2;
    subtotal=total1+total2;
    
    descuento_general=(subtotal*12)/100;
    t1=subtotal-descuento_general;
    return t1;
    };
   
    public int total2(int valor1,int descuento1, int total1,int valor2,int descuento2, int total2,
            int subtotal, int descuento_general2,int t2){
    
    descuento1=(valor1*5)/100;
    total1=valor1-descuento1;
        
    descuento2=(valor2*8)/100;
    total2=valor2-descuento2;
    subtotal=total1+total2;
    
    descuento_general2=(subtotal*7)/100;
    t2=subtotal-descuento_general2;
    return t2;
   
    };
    
}
