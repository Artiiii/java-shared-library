def call()
{
  bat label: '', script: """
  terraform -chdir infra
  terraform init -input=false
  terraform plan -out=tfplan -input=false
  terraform apply -input=false tfplan
  """
}
