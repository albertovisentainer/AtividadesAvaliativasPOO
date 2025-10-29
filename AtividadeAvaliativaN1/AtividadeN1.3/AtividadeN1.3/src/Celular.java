public class Celular {
    // atributos para celular

    private String marca;
    private String modelo;
    private Integer capacidadeGB;
    private boolean estado;

    // construtor para molde de celular
    public Celular(String marca, String modelo, Integer capacidadeGB, boolean estado) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeGB = capacidadeGB;
        this.estado = estado;
    }


    // get e set para buscar ou alterar atributos

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public Integer getCapacidadeGB(){
        return capacidadeGB;
    }
    public void setCapacidadeGB(Integer capacidadeGB){
        this.capacidadeGB = capacidadeGB;
    }
    public Boolean getEstado(){
        return estado;
    }
    public void setEstado(boolean estado){
        this.estado = estado;
    }

    // metodos para mudar o estado do celular ligado/desligado

    public void ligar(){
        if (!estado){
            estado = true;
            System.out.println(modelo + " Ligado!");
        } else {
            System.out.println(modelo + " Já está ligado!");
        }
    }
    public void desligar(){
        if (estado){
            estado = false;
            System.out.println(modelo + " Desligado!");
        }else {
            System.out.println(modelo + " Já está desligado!");
        }
    }
}
