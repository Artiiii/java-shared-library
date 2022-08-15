def init()
{
  powershell label: '', script: """
  cd infra
  terraform init -input=false
  """
}
def plan()
{
  powershell label: '', script: """
  cd infra
  terraform plan -out=tfplan -input=false
  """
}
def apply()
{
  powershell label: '', script: """
  cd infra
  terraform apply -input=false tfplan
  """
}
