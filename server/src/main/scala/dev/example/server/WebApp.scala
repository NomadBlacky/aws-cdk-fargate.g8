package dev.example.server

object WebApp extends cask.MainRoutes {
  @cask.get("/")
  def hello(): String = {
    "Hello World!"
  }

  initialize()
}
