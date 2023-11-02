package biblioteca;

public class Livro {
    
    private String titulo;
    private String autor;
    private String ISBN;
    private boolean emprestado;

    
    public Livro(String titulo, String autor, String ISBN) {
    	
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.emprestado = false;
    }
    
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = "";
        this.emprestado = false;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public String getAutor(){
        return this.autor;
    }
    
    public String getISBN(){
        return this.ISBN;
    }
    
    public boolean isEmprestado(){
        return this.emprestado;
    }
    
    private void setEmprestado(boolean isEmprestado){
        this.emprestado = isEmprestado;
    }

    public boolean reservar(){
        boolean livroEstaEmprestado = this.isEmprestado();
        
        if (livroEstaEmprestado){
            return false;
        } else {
            this.setEmprestado(true); 
            return true;                
        }
        
    }
    
    public boolean devolver(){
        boolean livroEstaEmprestado = this.isEmprestado();
        
        if (livroEstaEmprestado){ 
            this.setEmprestado(false);
            return true;
        } else {
            return false;
        }
    }
    
    public String exibir_info(){
        String informacoes = 
            "Título: " + this.getTitulo() +
            ", Autor: " + this.getAutor();
            
        String ISBN = this.getISBN();
        
        if (ISBN != ""){
            informacoes = informacoes + ", ISBN: " + ISBN;
        }
        
        
        boolean livroEmprestado = this.isEmprestado();
        if (livroEmprestado){
            informacoes = informacoes + " (Emprestado)";
        } else {
            informacoes = informacoes + " (Disponível)";
        }
        
        return informacoes;
        
    }
}
