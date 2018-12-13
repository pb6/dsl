job('test') {
  steps {
    shell "echo ${SECRET}"
  }
}
