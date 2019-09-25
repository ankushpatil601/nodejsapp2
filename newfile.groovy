pipeline 
	{
		agent any	 
		
		stages 
		{
			stage ('Checkout from repository') 
			{
				steps 
				{
					dir("${WORKSPACE}")
					{
						script
						{
							
							docker.withRegistry('https://index.docker.io/v1/', 'dockerhub') {
							
								sh """ 
								
								docker build -t ankushpa/nodeapp2:19 .
								
								"""
							}
							
						}
					}
				}
			}
		}
	}	
