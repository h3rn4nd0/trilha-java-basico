classDiagram
    iPhone <|-- ReprodutorMusical
    iPhone <|-- AparelhoTelefonico
    iPhone <|-- NavegadorInternet
  
    
    class ReprodutorMusical{
      -toca( )
      -pausar( )
      -selecionarMusica(String musica)
    }
    class AparelhoTelefonico{
      -iniciarCorreioVoz()
      -atender()
      -ligar(String numero)
    }
    class NavegadorInternet{
      +exibirPagina(String url)
      +adicionarNovaAba()
      +atualizarPagina()
    }
