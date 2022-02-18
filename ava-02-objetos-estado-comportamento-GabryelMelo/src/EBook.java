class EBook {

  final String titulo;
  final int paginas;
  int lendoPagina;

  EBook(String titulo, int paginas){

    this.titulo = titulo;
    this.paginas = paginas;
    this.lendoPagina = 1;

    if(titulo.isBlank()){
      throw new IllegalArgumentException("Titulo vazio");
    }

    if(paginas <= 0 || paginas > 5000){
      throw new IllegalArgumentException("Livro sem páginas ou com mais paginas do que o limite");
    }

  }

  void virarPagina() {
    if(this.lendoPagina == this.paginas){
      throw new IllegalStateException("Ultima página do livro.");
    } else {
      this.lendoPagina++;
    }
  }

  void voltarPagina() {
    if(this.lendoPagina == 1){
      throw new IllegalStateException("Proibido voltar página.");
    } else {
      this.lendoPagina--;
    }
  }

  void irParaPagina(int numPagina) {
    if(numPagina > paginas || numPagina < 0 || numPagina == 0){
      throw new IllegalArgumentException("Página não existente.");
    } else {
      this.lendoPagina = numPagina;
    }
  }

}
