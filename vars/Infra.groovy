def init()
{
  sh label: '', script: """
  cd infra
  terraform init -input=false
  """
}
def plan()
{
  sh label: '', script: """
  cd infra
  terraform plan -out=tfplan -input=false
  """
}
def apply()
{
  sh label: '', script: """
  cd infra
  terraform apply -input=false tfplan
  """
}
