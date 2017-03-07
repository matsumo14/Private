aws ec2 describe-instances --query 'Reservations[].Instances[].{PublicIp:PublicIpAddress,PrivateIp:PrivateIpAddress,InstanceId:InstanceId,Name:Tags[?Key==`Name`].Value}'
