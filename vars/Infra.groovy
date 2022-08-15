def call()
{
  bat label: '', script: """
  terraform -chdir=infra init -input=false
  terraform -chdir=infra plan -out=tfplan -input=false
  terraform -chdir=infra apply -input=false tfplan
  """
}
