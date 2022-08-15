def init()
{
  powershell label: '', script: 'terraform init -input=false'
}
def plan()
{
  powershell label: '', script: 'terraform plan -out=tfplan -input=false'
}
def apply()
{
  powershell label: '', script: 'terraform apply -input=false tfplan'
}
